CREATE TABLE tb_rate(
    rRateID serial PRIMARY KEY,
    rRateTypeID INTEGER,
    rRoomID INTEGER,
    rRate VARCHAR(5),
    rFromDate DATE,
    rToDate DATE
);

ALTER TABLE tb_rate ADD CONSTRAINT fk_rate_rateType 
FOREIGN KEY(rRateTypeID) REFERENCES tb_rate_types(rtRateTypeID);

ALTER TABLE tb_rate ADD CONSTRAINT fk_rate_room 
FOREIGN KEY(rRoomID) REFERENCES tb_room(rRoomID);
