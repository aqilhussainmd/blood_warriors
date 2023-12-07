CREATE TABLE blood_bank
(
  donation_id bigint UNIQUE NOT NULL AUTO_INCREMENT,
  donor_id bigint,
  blood_packet_id varchar(32) NOT NULL,
  packet_blood_group varchar(16),
  blood_donation_date datetime,
  packet_expiry_date datetime,
  donation_place varchar(64),
  packet_status varchar(32) COMMENT 'Available\nUtilised\nExpired\nShared\n\n',
  place_blood_packet_currently varchar(128) COMMENT 'Place where the blood packet is currently available',
  comments varchar(128),
  CONSTRAINT donation_id PRIMARY KEY (blood_packet_id)
)
COMMENT 'Details fo blood donation'
;

CREATE TABLE blood_bridge
(
  blood_bridge_id bigint NOT NULL,
  volunteer_id bigint,
  patient_id bigint,
  blood_bridge_active_status varchar(32),
  blood_bridge_start_date datetime,
  blood_bridge_end_date datetime,
  blood_bridge_patient_last_transfusion_date datetime,
  blood_bridge_patient_next_transfusion_date datetime,
  blood_bridge_patient_trasfusion_frequency smallint,
  blood_bridge_remarks varchar(256),
  blood_bridge_comments varchar(256),
  CONSTRAINT blood_bridge_id PRIMARY KEY (blood_bridge_id)
)
;

CREATE TABLE blood_bridge_donor
(
  blood_bridge_donor_id bigint NOT NULL AUTO_INCREMENT,
  blood_bridge_id bigint,
  donor_id bigint,
  blood_bridge_donor_active_status varchar(32),
  blood_bridge_donor_start_date datetime,
  blood_bridge_donor_end_date datetime,
  blood_bridge_donor_remarks varchar(256),
  CONSTRAINT blood_bridge_donor_id PRIMARY KEY (blood_bridge_donor_id)
)
;

CREATE TABLE blood_transfusion_tracker
(
  transfusion_id bigint NOT NULL AUTO_INCREMENT,
  patient_id bigint,
  transfusion_date bigint,
  transfusion_blood_group bigint,
  transfusion_place bigint,
  CONSTRAINT transfusion_id PRIMARY KEY (transfusion_id)
)
;

CREATE TABLE blood_transfusion_units
(
  blood_transfusion_unit_id bigint NOT NULL AUTO_INCREMENT,
  transfusion_id bigint,
  blood_packet_id varchar(32),
  CONSTRAINT blood_transfusion_units_id PRIMARY KEY (blood_transfusion_unit_id)
)
COMMENT 'How many packets of blood in each transfusion'
;

CREATE TABLE donor
(
  donor_id bigint NOT NULL AUTO_INCREMENT,
  user_id bigint,
  donor_previous_blood_donation_date datetime,
  donor_active_status varchar(16),
  donor_last_contact_date datetime,
  donor_donation_elgibility bool DEFAULT True,
  donar_last_tested_date datetime,
  CONSTRAINT donor_id PRIMARY KEY (donor_id)
)
COMMENT 'Details of the donor'
;

CREATE TABLE emergency_request
(
  emergency_request_id bigint NOT NULL,
  patient_id bigint,
  emergency_request_contact_number varchar(32),
  emergency_request_location varchar(256),
  emergency_request_blood_unit integer,
  emergency_request_blood_group bigint,
  emergency_request_person_name varchar(256),
  emergency_request_status varchar(128),
  CONSTRAINT emergency_request_id PRIMARY KEY (emergency_request_id)
)
;

CREATE TABLE patient
(
  patient_id bigint NOT NULL AUTO_INCREMENT,
  patient_name varchar(45),
  patient_gaurdian_name varchar(45),
  patient_gaurdian_realtionship varchar(45),
  patient_gaurddian_mobile varchar(45),
  patient_gender varchar(15),
  patient_date_of_birth date,
  patient_blood_group varchar(15),
  patient_no_of_units integer,
  patient_ferquency_of_transfusion varchar(15),
  patient_fhalassemia_id varchar(15),
  patient_proof_of_fhalassemia varchar(256),
  blood_bridge tinyint,
  user_id bigint NOT NULL,
  patient_previous_transfusion_date datetime,
  patient_next_transfusion_date datetime,
  CONSTRAINT patient_id PRIMARY KEY (patient_id)
)
;

CREATE TABLE user
(
  user_id bigint NOT NULL,
  user_name varchar(45),
  user_mobile varchar(45),
  user_email varchar(45),
  user_gender varchar(15),
  user_date_of_birth date,
  user_blood_group varchar(15),
  user_source varchar(225),
  user_country varchar(45),
  user_state varchar(45),
  user_city varchar(45),
  user_password varchar(2256),
  CONSTRAINT user_id PRIMARY KEY (user_id)
)
;

CREATE TABLE volunteer
(
  volunteer_id bigint NOT NULL,
  user_id bigint,
  volunteer_role varchar(32),
  volunteer_active_status bool DEFAULT TRUE,
  volunter_joining_date datetime,
  volunteer_leaving_date datetime,
  volunteer_access varchar(64),
  volunteer_remarks varchar(256),
  CONSTRAINT volunteer_id PRIMARY KEY (volunteer_id)
)
;

ALTER TABLE blood_bank ADD CONSTRAINT fk_blood_donation_tracker_donor_id
  FOREIGN KEY (donor_id) REFERENCES donor (donor_id) ON DELETE RESTRICT ON UPDATE CASCADE
;

ALTER TABLE blood_bridge ADD CONSTRAINT fk_blood_bridge_patient_id
  FOREIGN KEY (patient_id) REFERENCES patient (patient_id) ON UPDATE CASCADE
;

ALTER TABLE blood_bridge ADD CONSTRAINT fk_blood_bridge_volunteer_id
  FOREIGN KEY (volunteer_id) REFERENCES volunteer (volunteer_id) ON UPDATE CASCADE
;

ALTER TABLE blood_bridge_donor ADD CONSTRAINT fk_blood_bridge_donor_blood_bridge_id
  FOREIGN KEY (blood_bridge_id) REFERENCES blood_bridge (blood_bridge_id)
;

ALTER TABLE blood_bridge_donor ADD CONSTRAINT fk_blood_bridge_donor_donor_id
  FOREIGN KEY (donor_id) REFERENCES donor (donor_id) ON UPDATE CASCADE
;

ALTER TABLE blood_transfusion_tracker ADD CONSTRAINT fk_blood_transfusion_tracker_patient_id
  FOREIGN KEY (patient_id) REFERENCES patient (patient_id) ON UPDATE CASCADE
;

ALTER TABLE blood_transfusion_units ADD CONSTRAINT fk_blood_transfusion_units_blood_packet_id
  FOREIGN KEY (blood_packet_id) REFERENCES blood_bank (blood_packet_id) ON UPDATE CASCADE
;

ALTER TABLE blood_transfusion_units ADD CONSTRAINT fk_blood_transfusion_units_transfusion_id
  FOREIGN KEY (transfusion_id) REFERENCES blood_transfusion_tracker (transfusion_id) ON UPDATE CASCADE
;

ALTER TABLE donor ADD CONSTRAINT fk_donor_user_id
  FOREIGN KEY (user_id) REFERENCES user (user_id) ON DELETE RESTRICT ON UPDATE CASCADE
;

ALTER TABLE emergency_request ADD CONSTRAINT fk_emergency_request_patient_id
  FOREIGN KEY (patient_id) REFERENCES patient (patient_id) ON UPDATE CASCADE
;

ALTER TABLE patient ADD CONSTRAINT fk_patient_user_id
  FOREIGN KEY (user_id) REFERENCES user (user_id) ON DELETE RESTRICT ON UPDATE CASCADE
;

ALTER TABLE volunteer ADD CONSTRAINT fk_volunteer_user_id
  FOREIGN KEY (user_id) REFERENCES user (user_id) ON UPDATE CASCADE
;

