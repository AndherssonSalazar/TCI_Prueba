CREATE TABLE Empresa (
    idEmpresa INT PRIMARY KEY,
    ruc VARCHAR(11),
    RazonSocial VARCHAR(100),
    direccion VARCHAR(100),
    estado INT
);

CREATE TABLE Transaccion (
    idTransaccion INT PRIMARY KEY,
    idEmpresa INT,
    nombreDocumento VARCHAR(100),
    fechaRegistro DATE,
    estado INT,
    FOREIGN KEY (idEmpresa) REFERENCES Empresa(idEmpresa)
);

CREATE TABLE Respuesta (
    idRespuesta INT PRIMARY KEY,
    idTransaccion INT,
    codigoRespuesta VARCHAR(10),
    descripcionRespuesta VARCHAR(100),
    fechaRespuesta DATE,
    estado INT,
    FOREIGN KEY (idTransaccion) REFERENCES Transaccion(idTransaccion)
);