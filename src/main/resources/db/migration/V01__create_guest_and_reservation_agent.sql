CREATE TABLE tb_guest(
    gGuestID serial PRIMARY KEY,
    gFirstName VARCHAR(30),
    gLastName VARCHAR(30),
    gAddress VARCHAR(50),
    gAddress2 VARCHAR(50),
    gCity VARCHAR(35),
    gState VARCHAR(35),
    gZipCode VARCHAR(35),
    gCounty VARCHAR(35),
    gHomePhoneNumber VARCHAR(15),
    gCellularNumber VARCHAR(15),
    gEmailAddress VARCHAR(35),
    gGender CHAR(1)
);


CREATE TABLE tb_reservationAgent(
    raReservationAgentID serial PRIMARY KEY,
    raFirstName VARCHAR(30),
    raLastName VARCHAR(30),
    raAddress VARCHAR(50),
    raAddress2 VARCHAR(50),
    raCity VARCHAR(35),
    raState VARCHAR(35),
    raZipCode VARCHAR(35),
    raCountry VARCHAR(35),
    raHomePhoneNumber VARCHAR(15),
    raCellularNumber VARCHAR(15),
    raEmailAddress VARCHAR(35),
    raGender CHAR(1)
);

