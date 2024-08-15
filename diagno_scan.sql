CREATE DATABASE diagno_scan;
USE diagno_scan;

CREATE TABLE diseases(
   disease_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
   disease_name VARCHAR(100),
   disease_desc VARCHAR(300)
) ENGINE=INNODB;

CREATE TABLE symptoms(
   symptom_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
   symptom_name VARCHAR(100),
   symptom_desc VARCHAR(300)
) ENGINE=INNODB;

CREATE TABLE diseases_symptoms(
   ds_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
   symptom_id INT NOT NULL,
   disease_id INT NOT NULL, 
   FOREIGN KEY (symptom_id) REFERENCES symptoms(symptom_id),
   FOREIGN KEY (disease_id) REFERENCES diseases(disease_id) 
) ENGINE=INNODB;

-- Inserting data into the diseases table
INSERT INTO diseases (disease_name, disease_desc) VALUES 
('Influenza', 'Respiratory viral infection.'),
('Malaria', 'Mosquito-borne parasite disease.'),
('Diabetes', 'High blood sugar.'),
('Hypertension', 'High blood pressure.');

-- Inserting data into the symptoms table
INSERT INTO symptoms (symptom_name, symptom_desc) VALUES 
('Fever', 'High body temperature.'),
('Cough', 'Throat irritation.'),
('Fatigue', 'Extreme tiredness.'),
('Headache', 'Head pain.'),
('Nausea', 'Feeling of vomiting.');

-- Inserting data into the disease_symptoms table
INSERT INTO diseases_symptoms (symptom_id, disease_id) VALUES 
(1, 1), -- Fever related to Influenza
(2, 1), -- Cough related to Influenza
(3, 3), -- Fatigue related to Diabetes
(4, 3), -- Headache related to Diabetes
(5, 2); -- Nausea related to Malaria

-- Procedure to check if the specific symptom and disease combination exists
DELIMITER //

CREATE PROCEDURE CheckSymptomAndDisease(
    IN p_symptom_id INT,
    IN p_disease_id INT,
    OUT p_result TINYINT(1)
)
BEGIN
    DECLARE exists_count INT;

    -- Check if the specific symptom and disease combination exists:
    SELECT COUNT(*) INTO exists_count
    FROM diseases_symptoms
    WHERE symptom_id = p_symptom_id AND disease_id = p_disease_id;

    IF exists_count > 0 THEN
        SET p_result = 1;  -- TRUE
    ELSE
        SET p_result = 0;  -- FALSE
    END IF;
END //

DELIMITER ;

CALL CheckSymptomAndDisease(1, 1, @result);
SELECT @result;

SELECT * FROM diseases;
SELECT * FROM symptoms;
SELECT * FROM diseases_symptoms;
