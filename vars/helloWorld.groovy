def call() {
	sh 'echo Hi this is from Shared Library'

	def utils = new net.skny.DynamicUtils(this)
	utils.logCurrentTime()
}
