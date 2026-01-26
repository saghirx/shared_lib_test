package net.skny

class DynamicUtils implements Serializable {
    def script

    DynamicUtils(script) {
        this.script = script
    }

    void logCurrentTime() {
        script.echo "Current time (from DynamicUtils): ${new Date()}"
    }
}
