alter table tb_guest add constraint CK_GENDER check(gGender in('M','F'));

alter table tb_reservation_agent add constraint CK_GENDER check(raGender in('M','F'));

alter table tb_staff add constraint CK_GENDER check(sGender in('M','F'));
