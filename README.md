Este projeto foi desenvolvido com as seguintes tecnologias java spring boot spring data lombok spring web spring jpa mysql adcionei dependências o banco h2 para teste postiman para testar a funcionalidades do crud banco de dados.


comandos utilizados nos endpoints 

POST PRODUTOS - INSERT

POST - http://localhost:8080/produtos

{
    "nome" :"ideapads145",
    "preco" :2.698,
    "tipo": "notebook",
    "quantidade " : 400, 
    "marca" : "lenovo"

}


PUT PRODUTO - UPDATE

PUT - http://localhost:8080/produtos
{

    "nome" :"ideapads145",
    "preco" :2.698,
    "tipo": "notebook",
    "quantidade " : 400, 
    "marca" : "lenovo"
}

DELETE PRODUTO - DELETE


DELETE http://localhost:8080/produtos/2


GET PRODUTOS BYID

GET - http://localhost:8080/produtos/1


GET PRODUTO LIST ALL - BUSCAR TODOS

GET - http://localhost:8080/produtos




