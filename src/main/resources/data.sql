insert into roles(insert_date_time, insert_user_id, is_deleted, last_update_date_time, last_update_user_id, description)
VALUES ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Admin'),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Manager'),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Employee');
insert into users(insert_date_time, insert_user_id, is_deleted, last_update_date_time, last_update_user_id, enabled,
                  first_name, gender,phone, last_name, user_name, role_id)
values ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, true, 'admin', 'MALE','7896541230', 'admin', 'admin@admin.com',
        1);