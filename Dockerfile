# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM airhacks/payara

COPY ./target/JavaEEToAmazon.war ${DEPLOYMENT_DIR}
