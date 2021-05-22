#!/usr/bin/env groovy
// vars/YourStepName.groovy

def call() {
    // Do something here...
}

#!/usr/bin/env groovy

def call( String name = 'human' ) {
    echo "Hello, ${name}."
}
