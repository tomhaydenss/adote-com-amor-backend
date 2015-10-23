# adote-com-amor-backend
INSTALAÇÃO:
1. BANCO DE DADOS MYSQL
2. GRADLE
3. IMPORTAR DUMP: db/Dump20151023.sql
4. RODAR PROJETO COM: gradle clean build bootRun

CADASTRAR LOCALIZACAO
REQUEST:
curl -X POST -H "Content-Type: application/json" http://localhost:8080/localizacoes -d '{"cep": "69044000", "endereco": "Av. Des. João Machado, Qd-B, C-5, Cj. Flamanal - Planalto, Manaus - AM", "pontoReferencia": "Perto da Toca do Urso", "latitude": -3.0668977, "longitude": -60.0617911}'

RESPONSE:
{"id":"8a459df6-6128-494b-8c53-8313d91c2209","cep":"69044000","endereco":"Av. Des. João Machado, Qd-B, C-5, Cj. Flamanal - Planalto, Manaus - AM","pontoReferencia":"Perto da Toca do Urso","latitude":-3.0668976,"longitude":-60.06179}


CADASTRAR PROPRIETARIO
REQUEST:
curl -X POST -H "Content-Type: application/json" http://localhost:8080/proprietarios -d '{"nome": "Alessandro S Silva", "email": "motaro.am@gmail.com", "telefone": "+5592981362466", "idLocalizacao": "8a459df6-6128-494b-8c53-8313d91c2209"}'

RESPONSE:
{"id":"11e0a713-6eb3-4893-8f7a-a147d4c409e4","nome":"motaro.am@gmail.com","email":"Alessandro S Silva","telefone":"+5592981362466","localizacao":{"id":"8a459df6-6128-494b-8c53-8313d91c2209","cep":"69044000","endereco":"Av. Des. João Machado, Qd-B, C-5, Cj. Flamanal - Planalto, Manaus - AM","pontoReferencia":"Perto da Toca do Urso","latitude":-3.0669,"longitude":-60.0618}}


PESQUISAR RACAS DE ANIMAIS
REQUEST
curl -X GET http://localhost:8080/racas

RESPONSE
[{"id":1,"nome":"Abissínio","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":2,"nome":"American Shorthair","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":3,"nome":"Angorá","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":4,"nome":"Azul Russo","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":5,"nome":"Bengal","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":6,"nome":"Brazilian Shorthair","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":7,"nome":"British Shorthair","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":8,"nome":"Burmese","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":9,"nome":"Chartreux","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":10,"nome":"Cornish Rex","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":11,"nome":"Devon Rex","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":12,"nome":"Egyptian Mau","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":13,"nome":"European Shorthair","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":14,"nome":"Exótico","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":15,"nome":"Himalaio","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":16,"nome":"Maine Coon","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":17,"nome":"Munchkin","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":18,"nome":"Norwegian Forest","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":19,"nome":"Oriental","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":20,"nome":"Persa","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":21,"nome":"Ragdoll","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":22,"nome":"Sagrado da Birmânia","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":23,"nome":"Savannah","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":24,"nome":"Scottish Fold","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":25,"nome":"Siamês","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":26,"nome":"Sphynx","especie":{"id":2,"nome":"Felina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":27,"nome":"Bichon Frisé","especie":{"id":1,"nome":"Canina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":28,"nome":"Chihuahua","especie":{"id":1,"nome":"Canina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":29,"nome":"Lhassa Apso","especie":{"id":1,"nome":"Canina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":30,"nome":"Maltês","especie":{"id":1,"nome":"Canina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":31,"nome":"Pequinês","especie":{"id":1,"nome":"Canina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":32,"nome":"Pinscher Anão","especie":{"id":1,"nome":"Canina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":33,"nome":"Pug","especie":{"id":1,"nome":"Canina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":34,"nome":"Skilky Terrier Australiano","especie":{"id":1,"nome":"Canina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":35,"nome":"Terrier Australiano","especie":{"id":1,"nome":"Canina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":36,"nome":"Terrier Escocês","especie":{"id":1,"nome":"Canina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":37,"nome":"Yorkshire Terrier","especie":{"id":1,"nome":"Canina"},"porte":{"id":1,"nome":"Mini ou Toy","descricao":"Abaixo de 28cm até 6kg"}},{"id":38,"nome":"Basset Hound","especie":{"id":1,"nome":"Canina"},"porte":{"id":2,"nome":"Pequeno ou Anão","descricao":"De 28 a 35cm de 6 a 15kg"}},{"id":39,"nome":"Beagle","especie":{"id":1,"nome":"Canina"},"porte":{"id":2,"nome":"Pequeno ou Anão","descricao":"De 28 a 35cm de 6 a 15kg"}},{"id":40,"nome":"Boston Terrier","especie":{"id":1,"nome":"Canina"},"porte":{"id":2,"nome":"Pequeno ou Anão","descricao":"De 28 a 35cm de 6 a 15kg"}},{"id":41,"nome":"Buldogue Francês","especie":{"id":1,"nome":"Canina"},"porte":{"id":2,"nome":"Pequeno ou Anão","descricao":"De 28 a 35cm de 6 a 15kg"}},{"id":42,"nome":"Jack Russel Terrier","especie":{"id":1,"nome":"Canina"},"porte":{"id":2,"nome":"Pequeno ou Anão","descricao":"De 28 a 35cm de 6 a 15kg"}},{"id":43,"nome":"Schnauzer Anão","especie":{"id":1,"nome":"Canina"},"porte":{"id":2,"nome":"Pequeno ou Anão","descricao":"De 28 a 35cm de 6 a 15kg"}},{"id":44,"nome":"Spaniel Anão Continental","especie":{"id":1,"nome":"Canina"},"porte":{"id":2,"nome":"Pequeno ou Anão","descricao":"De 28 a 35cm de 6 a 15kg"}},{"id":45,"nome":"Terrier Brasileiro","especie":{"id":1,"nome":"Canina"},"porte":{"id":2,"nome":"Pequeno ou Anão","descricao":"De 28 a 35cm de 6 a 15kg"}},{"id":46,"nome":"American Pit Bull Terrier","especie":{"id":1,"nome":"Canina"},"porte":{"id":3,"nome":"Médio","descricao":"De 36 a 49cm de 15 a 25kg"}},{"id":47,"nome":"Boiadeiro Australiano","especie":{"id":1,"nome":"Canina"},"porte":{"id":3,"nome":"Médio","descricao":"De 36 a 49cm de 15 a 25kg"}},{"id":48,"nome":"Buldogue Inglês","especie":{"id":1,"nome":"Canina"},"porte":{"id":3,"nome":"Médio","descricao":"De 36 a 49cm de 15 a 25kg"}},{"id":49,"nome":"Bull Terrier","especie":{"id":1,"nome":"Canina"},"porte":{"id":3,"nome":"Médio","descricao":"De 36 a 49cm de 15 a 25kg"}},{"id":50,"nome":"Cocker Spaniel Americano","especie":{"id":1,"nome":"Canina"},"porte":{"id":3,"nome":"Médio","descricao":"De 36 a 49cm de 15 a 25kg"}},{"id":51,"nome":"Cocker Spaniel Inglês","especie":{"id":1,"nome":"Canina"},"porte":{"id":3,"nome":"Médio","descricao":"De 36 a 49cm de 15 a 25kg"}},{"id":52,"nome":"Fox Terrier","especie":{"id":1,"nome":"Canina"},"porte":{"id":3,"nome":"Médio","descricao":"De 36 a 49cm de 15 a 25kg"}},{"id":53,"nome":"Poodle (Padrão)","especie":{"id":1,"nome":"Canina"},"porte":{"id":3,"nome":"Médio","descricao":"De 36 a 49cm de 15 a 25kg"}},{"id":54,"nome":"Springer Spaniel Inglês","especie":{"id":1,"nome":"Canina"},"porte":{"id":3,"nome":"Médio","descricao":"De 36 a 49cm de 15 a 25kg"}},{"id":55,"nome":"Whippet","especie":{"id":1,"nome":"Canina"},"porte":{"id":3,"nome":"Médio","descricao":"De 36 a 49cm de 15 a 25kg"}},{"id":56,"nome":"Akita","especie":{"id":1,"nome":"Canina"},"porte":{"id":4,"nome":"Grande","descricao":"De 50 a 69cm de 25 a 45kg"}},{"id":57,"nome":"Border Collie","especie":{"id":1,"nome":"Canina"},"porte":{"id":4,"nome":"Grande","descricao":"De 50 a 69cm de 25 a 45kg"}},{"id":58,"nome":"Bóxer Alemão","especie":{"id":1,"nome":"Canina"},"porte":{"id":4,"nome":"Grande","descricao":"De 50 a 69cm de 25 a 45kg"}},{"id":59,"nome":"Chow Chow","especie":{"id":1,"nome":"Canina"},"porte":{"id":4,"nome":"Grande","descricao":"De 50 a 69cm de 25 a 45kg"}},{"id":60,"nome":"Colie","especie":{"id":1,"nome":"Canina"},"porte":{"id":4,"nome":"Grande","descricao":"De 50 a 69cm de 25 a 45kg"}},{"id":61,"nome":"Dálmata","especie":{"id":1,"nome":"Canina"},"porte":{"id":4,"nome":"Grande","descricao":"De 50 a 69cm de 25 a 45kg"}},{"id":62,"nome":"Doberman","especie":{"id":1,"nome":"Canina"},"porte":{"id":4,"nome":"Grande","descricao":"De 50 a 69cm de 25 a 45kg"}},{"id":63,"nome":"Dogue Argentino","especie":{"id":1,"nome":"Canina"},"porte":{"id":4,"nome":"Grande","descricao":"De 50 a 69cm de 25 a 45kg"}},{"id":64,"nome":"Galgo Espanhol","especie":{"id":1,"nome":"Canina"},"porte":{"id":4,"nome":"Grande","descricao":"De 50 a 69cm de 25 a 45kg"}},{"id":65,"nome":"Husky Siberiano","especie":{"id":1,"nome":"Canina"},"porte":{"id":4,"nome":"Grande","descricao":"De 50 a 69cm de 25 a 45kg"}},{"id":66,"nome":"Labrador Retriever","especie":{"id":1,"nome":"Canina"},"porte":{"id":4,"nome":"Grande","descricao":"De 50 a 69cm de 25 a 45kg"}},{"id":67,"nome":"Mastim Napolitano","especie":{"id":1,"nome":"Canina"},"porte":{"id":4,"nome":"Grande","descricao":"De 50 a 69cm de 25 a 45kg"}},{"id":68,"nome":"Dogue Alemão","especie":{"id":1,"nome":"Canina"},"porte":{"id":5,"nome":"Gigante","descricao":"Acima de 70cm de 45 a 60kg"}},{"id":69,"nome":"Fila Brasileiro","especie":{"id":1,"nome":"Canina"},"porte":{"id":5,"nome":"Gigante","descricao":"Acima de 70cm de 45 a 60kg"}},{"id":70,"nome":"Greyhound","especie":{"id":1,"nome":"Canina"},"porte":{"id":5,"nome":"Gigante","descricao":"Acima de 70cm de 45 a 60kg"}},{"id":71,"nome":"Mastife Inglês","especie":{"id":1,"nome":"Canina"},"porte":{"id":5,"nome":"Gigante","descricao":"Acima de 70cm de 45 a 60kg"}},{"id":72,"nome":"Mastim dos Pireneus","especie":{"id":1,"nome":"Canina"},"porte":{"id":5,"nome":"Gigante","descricao":"Acima de 70cm de 45 a 60kg"}},{"id":73,"nome":"Mastim Espanhol","especie":{"id":1,"nome":"Canina"},"porte":{"id":5,"nome":"Gigante","descricao":"Acima de 70cm de 45 a 60kg"}},{"id":74,"nome":"São Bernardo","especie":{"id":1,"nome":"Canina"},"porte":{"id":5,"nome":"Gigante","descricao":"Acima de 70cm de 45 a 60kg"}}]


CADASTRAR ANIMAL
REQUEST:
curl -X POST -H "Content-Type: application/json" http://localhost:8080/animais -d '{"nome": "Maximilius", "sexo": "M", "descricao": "Cão muito carinhoso e fiel. Gosta muito de brincar de empurrar.", "dataNascimento": "01/01/2008", "idRaca": 62, "idProprietario": "11e0a713-6eb3-4893-8f7a-a147d4c409e4"}'

RESPONSE:
{"id":"e8c682d2-004a-4e50-9462-1fe64062f7f2","nome":"Maximilius","sexo":"M","descricao":"Cão muito carinhoso e fiel. Gosta muito de brincar de empurrar.","dataNascimento":"01/01/2008","dataCadastro":"23/10/2015 02:35:12","raca":{"id":62,"nome":"Doberman","especie":{"id":1,"nome":"Canina"},"porte":{"id":4,"nome":"Grande","descricao":"De 50 a 69cm de 25 a 45kg"}},"proprietario":{"id":"11e0a713-6eb3-4893-8f7a-a147d4c409e4","nome":"motaro.am@gmail.com","email":"Alessandro S Silva","telefone":"+5592981362466","localizacao":{"id":"8a459df6-6128-494b-8c53-8313d91c2209","cep":"69044000","endereco":"Av. Des. João Machado, Qd-B, C-5, Cj. Flamanal - Planalto, Manaus - AM","pontoReferencia":"Perto da Toca do Urso","latitude":-3.0669,"longitude":-60.0618}}}