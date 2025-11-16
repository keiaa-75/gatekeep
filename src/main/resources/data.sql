-- Delete all existing data to prevent conflicts
DELETE FROM ATTENDANCE_RECORD;
DELETE FROM STUDENT;

-- Insert new sample students matching the new model
INSERT INTO STUDENT (LRN, SURNAME, FIRST_NAME, MIDDLE_INITIAL, STRAND, GRADE_LEVEL, SECTION, CONTACT_NUMBER) 
VALUES
('123456789000', 'Maniquiz', 'Jan Conrad', 'M', 'STEM', 12, 'SCALA', '09123456789'),
('111111111111', 'Dela Cruz', 'Maria', 'C', 'HUMSS', 11, 'ALPHA', '09171111111'),
('222222222222', 'Santos', 'Pedro', 'R', 'TVL', 12, 'BRAVO', '09182222222'),
('333333333333', 'Garcia', 'Ana', 'L', 'ABM', 11, 'CHARLIE', '09193333333'),
('444444444444', 'Reyes', 'Luis', 'P', 'GAS', 12, 'DELTA', '09204444444');