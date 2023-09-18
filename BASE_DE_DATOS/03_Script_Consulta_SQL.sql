SELECT e.RazonSocial, r.codigoRespuesta, r.fechaRespuesta
FROM Empresa e
INNER JOIN Transaccion t ON e.idEmpresa = t.idEmpresa
INNER JOIN Respuesta r ON t.idTransaccion = r.idTransaccion
WHERE r.fechaRespuesta = (
    SELECT MAX(r2.fechaRespuesta)
    FROM Respuesta r2
    WHERE r2.idTransaccion = r.idTransaccion
)