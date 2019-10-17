CREATE TABLE tb_room_status(
	rsRoomStatusID serial PRIMARY KEY,
    rsRoomStatus VARCHAR(30),
    rsDescription VARCHAR(30),
    rsSortOrder VARCHAR(30),
    rsActive  BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE tb_room_type(
	rtRoomTypeID serial PRIMARY KEY,
    rtRoomType VARCHAR(30),
    rtDescription VARCHAR(30),
    rtSortOrder VARCHAR(30),
    rtActive  BOOLEAN NOT NULL DEFAULT FALSE
);
