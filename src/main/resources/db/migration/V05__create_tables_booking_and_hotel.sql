CREATE TABLE tb_booking (
    bBookingID serial PRIMARY KEY,
    bHotelID INTEGER,
    bGuestID INTEGER,
    bReservationAgentID INTEGER,
    bBookingStatusID INTEGER,
    bDateFrom DATE,
    bDateTo DATE,
    bRoomCount INTEGER
);

CREATE TABLE tb_hotel (
    hHotelID serial PRIMARY KEY,
    hHotelCode INTEGER,
    hName VARCHAR(30),
    hMotto VARCHAR(30),
    hAddress VARCHAR(50),
    hAddress2 VARCHAR(50),
    hCity VARCHAR(35),
    hState VARCHAR(35),
    hZipCode VARCHAR(35),
    hMainPhoneNumber VARCHAR(55),
    hFaxNumber VARCHAR(55),
    hTollFreeNumber VARCHAR(55),
    hCompanyeMailAddress VARCHAR(35),
    hWebsiteAddress VARCHAR(30),
    hMain VARCHAR(30),
    hImagePath VARCHAR(30)
);

CREATE TABLE tb_booking_status(
    bsBookingStatusID serial PRIMARY KEY,
    bsStatus VARCHAR(30),
    bsDescription VARCHAR(30),
    bsSortOrder VARCHAR(30),
    bsActive BOOLEAN NOT NULL DEFAULT FALSE
);

ALTER TABLE tb_booking ADD CONSTRAINT fk_booking_hotel
FOREIGN KEY(bHotelID) REFERENCES tb_hotel(hHotelID);

ALTER TABLE tb_booking ADD CONSTRAINT fk_booking_guest
FOREIGN KEY(bGuestID) REFERENCES tb_guest(gGuestID);

ALTER TABLE tb_booking ADD CONSTRAINT fk_booking_reservation_agent
FOREIGN KEY(bReservationAgentID) REFERENCES tb_reservation_agent(raReservationAgentID);

ALTER TABLE tb_booking ADD CONSTRAINT fk_booking_booking_status
FOREIGN KEY(bBookingStatusID) REFERENCES tb_booking_status(bsBookingStatusID);
