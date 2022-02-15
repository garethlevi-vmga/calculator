![Generic badge](https://codebuild.us-east-1.amazonaws.com/badges?uuid=eyJlbmNyeXB0ZWREYXRhIjoiQXE1TGZQNUFweW55dGRxbVhFYWcrdWlzaDFocVJrbHovRExtcTRNTk5qeEZCVDB4azkxWURKNlVhaEpkb3pNUkxpNVljTUVxNXhiU2xTRkVOYnhzeHhrPSIsIml2UGFyYW1ldGVyU3BlYyI6Ii9QVmdxaE9tTDRJRXhEeHoiLCJtYXRlcmlhbFNldFNlcmlhbCI6MX0%3D&branch=main)

# Escher

## Build (local)
* Run `./scripts/build.sh` to test and build the Escher application (with debug enabled)

To disable debug, edit the `build.sh` file and set the `ENABLE_DEBUG` value to anything other that "yes".  



## Run
To run the Escher docker container, run the following command:  
* Run `docker run -dp 8080:80 --env-file <path to env file> --name escher escher:latest`

Details of the required `--env-file` are as follows:

```shell
CORE_STUDIO_DB_USER=<studio database user>
CORE_STUDIO_DB_PASSWORD=<studio database user password>
CORE_STUDIO_DB_HOST=<studio database host, typically 'host.docker.internal'>
CORE_STUDIO_DB_NAME=<studio database name>
CORE_STUDIO_APP_DEPLOY_ID=<application deployment id, possibly 'escherdev00vmga'>
CORE_STUDIO_PMW_DB_USER=<PMW database user>
CORE_STUDIO_PMW_DB_PASSWORD=<PMW database password>
CORE_STUDIO_PMW_DB_HOST=<PMW database host, typically 'host.docker.internal'>
CORE_STUDIO_PMW_DB_NAME=<PMW database name>
APP_DB_USER=<application database user>
APP_DB_PASSWORD=<application database password>
APP_DB_HOST=<application database host, typically 'host.docker.internal'>
APP_DB_NAME=<application database name>
APP_DEPLOY_ID=<application deployment id, possibly 'escherdev00vmga'>
APP_ACCESS_GROUP=<application access group, possibly '0'>
EMAIL_HOSTNAME=<email server host, if using mailhog this is 'host.docker.internal'>
EMAIL_PORT=<email server port, if using mailhog this is '1025'>
NEW_RELIC_URL=<URL for new relic integration>
CRON_ERROR_EMAIL=<email address that receives cron error notification>
PDFLIB_LICENSE_KEY=<license key for PDFlib>
```

``````