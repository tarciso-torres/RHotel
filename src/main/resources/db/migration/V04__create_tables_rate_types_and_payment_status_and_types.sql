CREATE TABLE tb_rate_types (
    rtRateTypeID serial PRIMARY KEY,
    rtRateType VARCHAR(30),
    rtDescription VARCHAR(30),
    rtSortOrder VARCHAR(30),
    rtActive BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE tb_payment_status(
    psPaymentStatusID serial PRIMARY KEY,
    psStatus VARCHAR(30),
    psDescription VARCHAR(30),
    psSortOrder VARCHAR(30),
    psActive BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE tb_payment_type(
    ptPaymentTypeID serial PRIMARY KEY,
    ptPaymentType VARCHAR(30),
    ptSortOrder VARCHAR(30),
    ptActive BOOLEAN NOT NULL DEFAULT FALSE
);
