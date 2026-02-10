CREATE TABLE assets (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(255) NOT NULL,
                        type VARCHAR(100),
                        serial_number VARCHAR(100) UNIQUE,
                        assigned_to VARCHAR(255)
);