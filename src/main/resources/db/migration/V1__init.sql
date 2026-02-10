CREATE TABLE assets (
                        id BIGSERIAL PRIMARY KEY,
                        name VARCHAR(255) NOT NULL,
                        type VARCHAR(100),
                        serial_number VARCHAR(100) UNIQUE,
                        assigned_to VARCHAR(255)
);