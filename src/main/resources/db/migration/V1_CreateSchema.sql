CREATE TABLE api_resource
(
  name VARCHAR(255) PRIMARY KEY NOT NULL,
  url VARCHAR(255)
);
CREATE UNIQUE INDEX uk_8b997c6u8hjbpvjm8a3jea05n ON api_resource (url);