CREATE TABLE tb_staff(
    sStafftID serial PRIMARY KEY,
    sFirstName VARCHAR(30),
    sLastName VARCHAR(30),
    sAddress VARCHAR(50),
    sAddress2 VARCHAR(50),
    sCity VARCHAR(35),
    sState VARCHAR(35),
    sZipCode VARCHAR(35),
    sCounty VARCHAR(35),
    sHomePhoneNumber VARCHAR(15),
    sCellularNumber VARCHAR(15),
    sEmailAddress VARCHAR(35),
    sGender char(3),
    sPositionID INTEGER
);

CREATE TABLE tb_position(
    pPositionID serial PRIMARY KEY,
    pPosition VARCHAR(30),
    pSortOrder VARCHAR(30),
    pActive BOOLEAN NOT NULL DEFAULT FALSE
);

ALTER TABLE tb_staff ADD CONSTRAINT fk_staff_position
FOREIGN KEY(sPositionID) REFERENCES tb_position(pPositionID);
