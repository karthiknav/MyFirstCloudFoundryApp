# MyFirstCloudFoundryApp

A simple SpringBoot application that can be deployed to CloudFoundry

Prerequisites:

1. Create a free account in SAP BTP
2. Create a subAccount, enable CloudFoundry, then create organization and space
3. Download cf CLI.
4. Create a manifest.yml file with application name, target path to jar, instances etc. 
   This file provides instructions for the cloudfoundry deployment.

Deployment:
1. Login to cf CLI
    - cf login -u S0025060671 -p DiamondPen@69 -a https://api.cf.eu20-001.hana.ondemand.com
2. Target the correct org and space
    - cf target -o "Naveena ARUL_cloudfoundry-mm06oum3" -s first-space
3. Deploy the application
    - cf push
