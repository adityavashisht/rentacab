CREATE TABLE users (
  id       INT         NOT NULL PRIMARY KEY,
  username VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  enabled  BOOLEAN     NOT NULL

);


CREATE UNIQUE INDEX ix_username ON users (username);


CREATE TABLE authority (
  authority_id INT         NOT NULL PRIMARY KEY ,
  value        VARCHAR(50) NOT NULL
);

CREATE UNIQUE INDEX ix_unq_auth_value ON authority (value);


CREATE TABLE user_authorities (

  user_id      INT NOT NULL ,
  authority_id INT NOT NULL,

  CONSTRAINT fk_authorities FOREIGN KEY (authority_id) REFERENCES authority (authority_id)

);


CREATE UNIQUE INDEX ix_auth_username ON user_authorities (user_id, authority_id);

ALTER TABLE rentacab.authorities RENAME TO rentacab.user_authorities;


INSERT INTO authority VALUES (1, 'ROLE_ADMIN');

INSERT into users values (1,'admin', 'password', 1);

INSERT INTO user_authorities values (1,1);
