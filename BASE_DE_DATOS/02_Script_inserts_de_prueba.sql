-- Inserts de prueba para la tabla empresa
INSERT INTO Empresa (idEmpresa, ruc, RazonSocial, direccion, estado) 
VALUES (1, '20547891235', 'Empresa 1', 'Av. Los Proceres 123', 1);

INSERT INTO Empresa (idEmpresa, ruc, RazonSocial, direccion, estado) 
VALUES (2, '20457896523', 'Empresa 2', 'Jr. Los Jazmines 456', 1);

INSERT INTO Empresa (idEmpresa, ruc, RazonSocial, direccion, estado) 
VALUES (3, '20145967852', 'Empresa 3', 'Av. El Sol 789', 1);

--Inserts de prueba para la tabla Transaccion
INSERT INTO Transaccion (idTransaccion, idEmpresa, nombreDocumento, fechaRegistro, estado)
VALUES (1, 1, 'Documento 1', '2022-04-15', 1);

INSERT INTO Transaccion (idTransaccion, idEmpresa, nombreDocumento, fechaRegistro, estado)
VALUES (2, 1, 'Documento 2', '2022-04-16', 1);

INSERT INTO Transaccion (idTransaccion, idEmpresa, nombreDocumento, fechaRegistro, estado)
VALUES (3, 2, 'Documento 3', '2022-04-17', 1);

INSERT INTO Transaccion (idTransaccion, idEmpresa, nombreDocumento, fechaRegistro, estado)
VALUES (4, 3, 'Documento 4', '2022-04-18', 1);

--Inserts de prueba para la tabla Resuesta
INSERT INTO Respuesta (idRespuesta, idTransaccion, codigoRespuesta, descripcionRespuesta, fechaRespuesta, estado)
VALUES (1, 1, 'COD001', 'Respuesta 1', '2022-04-15', 1);

INSERT INTO Respuesta (idRespuesta, idTransaccion, codigoRespuesta, descripcionRespuesta, fechaRespuesta, estado)
VALUES (2, 2, 'COD002', 'Respuesta 2', '2022-04-16', 1);

INSERT INTO Respuesta (idRespuesta, idTransaccion, codigoRespuesta, descripcionRespuesta, fechaRespuesta, estado)
VALUES (3, 3, 'COD003', 'Respuesta 3', '2022-04-17', 1);

INSERT INTO Respuesta (idRespuesta, idTransaccion, codigoRespuesta, descripcionRespuesta, fechaRespuesta, estado)
VALUES (4, 4, 'COD004', 'Respuesta 4', '2022-04-18', 1);

INSERT INTO Respuesta (idRespuesta, idTransaccion, codigoRespuesta, descripcionRespuesta, fechaRespuesta, estado)
VALUES (5, 1, 'COD005', 'Respuesta 5', '2022-04-19', 1);

INSERT INTO Respuesta (idRespuesta, idTransaccion, codigoRespuesta, descripcionRespuesta, fechaRespuesta, estado)
VALUES (6, 3, 'COD006', 'Respuesta 6', '2022-04-20', 1);

INSERT INTO Respuesta (idRespuesta, idTransaccion, codigoRespuesta, descripcionRespuesta, fechaRespuesta, estado)
VALUES (7, 4, 'COD007', 'Respuesta 7', '2022-04-21', 1);