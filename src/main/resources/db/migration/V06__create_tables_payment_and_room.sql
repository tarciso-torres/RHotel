CREATE TABLE tb_payment (
    pPaymentID serial PRIMARY KEY,
    pRoomID INTEGER,
    pPaymentTypeID INTEGER,
    pPaymentStatusID INTEGER,
    pDate TIMESTAMP,
    pPayment VARCHAR(10)
);

CREATE TABLE tb_room (
    rRoomID serial PRIMARY KEY,
    rHotelID INTEGER,
    rRoomTypeID INTEGER,
    rRoomStatusID INTEGER,
    rFloor CHAR(3),
    rRoomNumber CHAR(4),
    rDescription VARCHAR(50)
);

ALTER TABLE tb_payment ADD CONSTRAINT fk_payment_room
FOREIGN KEY(pRoomID) REFERENCES tb_room(rRoomID);

ALTER TABLE tb_payment ADD CONSTRAINT fk_payment_paymentType
FOREIGN KEY(pPaymentTypeID) REFERENCES tb_payment_type(ptPaymentTypeID);

ALTER TABLE tb_payment ADD CONSTRAINT fk_payment_paymentStatus
FOREIGN KEY(pPaymentStatusID) REFERENCES tb_payment_status(psPaymentStatusID);

ALTER TABLE tb_room ADD CONSTRAINT fk_room_hotel
FOREIGN KEY(rHotelID) REFERENCES tb_hotel(hHotelID);

ALTER TABLE tb_room ADD CONSTRAINT fk_room_roomType
FOREIGN KEY(rRoomTypeID) REFERENCES tb_room_type(rtRoomTypeID);

ALTER TABLE tb_room ADD CONSTRAINT fk_room_roomStatus
FOREIGN KEY(rRoomStatusID) REFERENCES tb_room_status(rsRoomStatusID);
