CREATE DATABASE IF NOT EXISTS inmueblesFiltro;

INSERT INTO roles (nombre, descripcion) VALUES (1, "Todos los permisos"), (2, "Permisos de solo lectura");

INSERT INTO oficinas (codigo, nombre) VALUES (1234567, "Oficina A");

INSERT INTO agentes (cedula, p_nombre, s_nombre, p_apellido, s_apellido, email, pass_word, rol_id, oficina_id)
VALUES (123456789, "admin", NULL, "admin", NULL, "admin@mail.com", "admin", 1, 1),
(1234567890, 'Carlos', 'Andrés', 'González', 'Pérez', 'director1@example.com', 'password123', 2, 1),
(2345678901, 'María', 'Isabel', 'López', 'Martínez', 'director2@example.com', 'securepass', 2, 1),
(3456789012, 'José', 'Luis', 'Hernández', 'García', 'director3@example.com', 'mysecret', 2, 1),
(4567890123, 'Ana', 'María', 'Díaz', 'Rodríguez', 'director4@example.com', 'abc123', 2, 1),
(5678901234, 'Pedro', 'Pablo', 'Martínez', 'Sánchez', 'director5@example.com', 'password321', 2, 1);

INSERT INTO ciudades (nombre)
VALUES
('Bogotá'),
('Medellín'),
('Cali'),
('Barranquilla'),
('Cartagena'),
('Bucaramanga'),
('Pereira'),
('Santa Marta'),
('Manizales'),
('Ibagué');

INSERT INTO propietarios (cedula, telefono, email, p_nombre, s_nombre, p_apellido, s_apellido, pass_word, rol_id) VALUES
('1234567890', '1234567890', 'usuario1@example.com', 'Juan', 'Carlos', 'González', 'Pérez', 'password123', 2),
('2345678901', '2345678901', 'usuario2@example.com', 'María', 'Isabel', 'López', 'Martínez', 'securepass', 2),
('3456789012', '3456789012', 'usuario3@example.com', 'José', 'Luis', 'Hernández', 'García', 'mysecret', 2),
('4567890123', '4567890123', 'usuario4@example.com', 'Ana', 'María', 'Díaz', 'Rodríguez', 'abc123', 2),
('5678901234', '5678901234', 'usuario5@example.com', 'Pedro', 'Pablo', 'Martínez', 'Sánchez', 'password321', 2),
('6789012345', '6789012345', 'usuario6@example.com', 'Laura', 'Beatriz', 'Gómez', 'Pérez', 'letmein', 2),
('7890123456', '7890123456', 'usuario7@example.com', 'Diego', 'Fernando', 'Alvarez', 'Fernández', 'qwerty', 2),
('8901234567', '8901234567', 'usuario8@example.com', 'Sofía', 'Gabriela', 'Torres', 'González', 'hello123', 2),
('9012345678', '9012345678', 'usuario9@example.com', 'Daniel', 'Alejandro', 'Ramírez', 'Sánchez', 'iloveyou', 2),
('0123456789', '0123456789', 'usuario10@example.com', 'Carolina', 'Mariana', 'Rojas', 'Martínez', '123456', 2),
('1234509876', '1234509876', 'usuario11@example.com', 'Fernando', 'Javier', 'Gutiérrez', 'López', 'password', 2),
('2345098765', '2345098765', 'usuario12@example.com', 'Andrea', 'Gabriela', 'Sánchez', 'García', 'secure123', 2),
('3450987654', '3450987654', 'usuario13@example.com', 'Ricardo', 'Alberto', 'Fernández', 'Gómez', 'letmeout', 2),
('4509876543', '4509876543', 'usuario14@example.com', 'Verónica', 'Marcela', 'Martínez', 'Hernández', 'admin123', 2),
('5098765432', '5098765432', 'usuario15@example.com', 'Gonzalo', 'Sebastián', 'Pérez', 'Alvarez', 'changeme', 2);

INSERT INTO zonas (ciudad_id, nombre, codigo) VALUES 
(1, "Zona A", 125465462),
(1, "Zona B", 125465463),
(1, "Zona C", 125465464),
(1, "Zona D", 125465465),
(1, "Zona E", 125465466);