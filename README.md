# evaluacion
# 1 Crear Base de datos:
** BD: postgres
** username: postgres
** password: admin
# 2 Deployar el proyecto
# 3 Ejecutar el API http://localhost:8080/user con verbo POST
## Request Body
{
    "name": "Juan Carlos",
    "email": "juancarlo@gmail",
    "password": "hunter",
    "phones": [
        {
            "number": "97237436",
            "citycode": "1",
            "contrycode": "57"
        }
    ]
}