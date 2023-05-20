# Micro-Service
Activité Pratique N°4 : Mise en oeuvre d'un micro-service


    1 Créer un projet Spring Boot avec les dépendances Web, Spring Data JPA, H2, Lombok
    
![micro1](https://github.com/YassineOurara/Micro-Service/assets/101317995/c075ddc1-34c3-4372-bc89-c1188ae7be7d)



    2 Créer l'entité JPA Compte
 
 ![2](https://github.com/YassineOurara/Micro-Service/assets/101317995/f3878b79-a21e-414e-99e2-7b35d4d06807)


    3 Créer l'interface CompteRepository basée sur Spring Data
    
![3](https://github.com/YassineOurara/Micro-Service/assets/101317995/5fc11de3-95a1-4c49-9cd5-46fdaec8b4af)

    
    4 Tester la couche DAO
    
![coucheDAO1](https://github.com/YassineOurara/Micro-Service/assets/101317995/1b850894-1eb2-4b4f-8d9f-16a26ecd1bcd)

![coucheDAO2](https://github.com/YassineOurara/Micro-Service/assets/101317995/9e1c4f3f-0b31-415d-a98f-e831619dd065)

    5 Créer le Web service Restfull qui permet de gérer des comptes
![Restfull1](https://github.com/YassineOurara/Micro-Service/assets/101317995/31116b26-0e9a-450e-b733-e27a9816e65d)

![Restfull2](https://github.com/YassineOurara/Micro-Service/assets/101317995/74022e30-bb9e-429d-9713-9cbba0d61da3)

    6 Tester le web micro-service en utilisant un client REST comme Postman
    Liste des comptes 
![Postman_Liste des comptes](https://github.com/YassineOurara/Micro-Service/assets/101317995/b46d93b2-73dc-47d9-8c45-25cd5e7d9bcc)

    6.1 Trouver compte selon l'ID

![Postman_Find account_Id](https://github.com/YassineOurara/Micro-Service/assets/101317995/50faba4b-e0d4-4f0d-9667-95bb47d242da)

    6.2 Sauvegarder compte

    
![Postman_saveacc](https://github.com/YassineOurara/Micro-Service/assets/101317995/5a7a7179-bc76-4078-9d4f-2763cb99079a)

    6.3 Mettre à jour compte
    
![Postman_update](https://github.com/YassineOurara/Micro-Service/assets/101317995/cf26ef1e-fb88-401a-8ad2-d6a73bdd22fb)




    
    
    7 Générer et tester le documentation Swagger de des API Rest du Web service
    8 Exposer une API Restful en utilisant Spring Data Rest en exploitant des projections
    9 Créer les DTOs et Mappers
    10 Créer la couche Service (métier) et du micro service
    11 Créer un Web service GraphQL pour ce micro-service
