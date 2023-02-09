# BharatPrabhu_BED_Lab6
#execute below script in MYSQL terminal after the web server is started and one unsuccess full attempt to login is done.
use SecureStudentManagement; 

INSERT INTO ROLES VALUES (1,'USER');
INSERT INTO ROLES VALUES (2,'ADMIN');
/* password encrypted from https://bcrypt-generator.com/   */
/* setting user=AdminBharat password=Admin@1234 */
INSERT INTO users (`user_id`, `password`, `username`) VALUES ('1', '$2a$12$9afx7R8Dhz33S60OCWdy/eGwrrsS2mr6ftPdvwPmkM/lt1pE03xHi', 'AdminBharat');
/* setting user=UserBharat password=User@1234  */
INSERT INTO users (`user_id`, `password`, `username`) VALUES ('2', '$2a$12$EkiRREou6QQ7/ecimXCvx.VfQRN27iTXHfjdIekpRjaUQcIksnLWu', 'UserBharat');
/* insert roles in the datav=base */
INSERT INTO users_roles (user_id, role_id) SELECT users.user_id,roles.role_id FROM users,roles where roles.role_id=1 and users.user_id=2;
INSERT INTO users_roles (user_id, role_id) SELECT users.user_id,roles.role_id FROM users,roles where roles.role_id=2 and users.user_id=1;
/* delete unwanted data */
delete from users_roles where role_id=2 and user_id=2;
