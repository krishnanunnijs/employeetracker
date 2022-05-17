DROP TABLE IF EXISTS employee;

-- Table Creation Scripts
-- Create Employee table
CREATE TABLE employee 
( id INT AUTO_INCREMENT PRIMARY KEY
, name VARCHAR(50) NOT NULL
, email VARCHAR(250)
--, date_of_join DATE NOT NULL
, designation VARCHAR(250) NOT NULL
--, project_id INT
, created_date DATE
--, created_by INT
, last_update_date DATE
--, last_update_by INT
);


-- Insert Scripts
INSERT INTO employee 
( name, /*date_of_join,*/ designation, created_date, last_update_date )
VALUES
  ( 'Brownie Giles', /*to_date('01-JAN-2010','DD-MON-YYYY'),*/ 'Backend Dev', SYSDATE, SYSDATE )
, ( 'Amber Fox', /*to_date('01-JAN-2010','DD-MON-YYYY'),*/ 'BA', SYSDATE, SYSDATE )
, ( 'Trudy Winter', /*to_date('01-JAN-2010','DD-MON-YYYY'),*/ 'QE', SYSDATE, SYSDATE );

