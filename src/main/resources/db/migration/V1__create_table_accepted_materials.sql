-- Criar ENUM (caso você vá usar waste_type no futuro com Enum do PostgreSQL)
CREATE TYPE waste_type AS ENUM (
    'CELL_PHONE',
    'COMPUTER',
    'BATTERY',
    'PRINTER',
    'KEYBOARD',
    'TABLET',
    'CHARGER',
    'OTHER_TYPES'
    );

-- Tabela de resíduos eletrônicos
CREATE TABLE Electronic_wastes (
                                   id BIGSERIAL PRIMARY KEY,
                                   Waste_type VARCHAR(255) NOT NULL,
                                   Description TEXT NOT NULL
);

-- Tabela de pontos de coleta
CREATE TABLE Collection_points (
                                   id BIGSERIAL PRIMARY KEY,
                                   Name VARCHAR(255) NOT NULL,
                                   Address VARCHAR(255) NOT NULL,
                                   Collection_day DATE NOT NULL
);

-- Tabela de materiais aceitos
CREATE TABLE Accepted_materials (
                                    id BIGSERIAL PRIMARY KEY,
                                    Collection_Points_id BIGINT NOT NULL,
                                    Electronic_wastes_id BIGINT NOT NULL,
                                    max_capacity NUMERIC(10, 2) NOT NULL,
                                    CONSTRAINT fk_accepted_materials_collection_points FOREIGN KEY (Collection_Points_id)
                                        REFERENCES Collection_points(id) ON DELETE CASCADE,
                                    CONSTRAINT fk_accepted_materials_electronic_waste FOREIGN KEY (Electronic_wastes_id)
                                        REFERENCES Electronic_wastes(id) ON DELETE CASCADE
);
