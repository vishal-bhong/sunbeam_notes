// module
// type:
// - custom: written by developer
// - system: provided by node

// import the system module named os
const os = require('node:os')

console.log(`host name = ${os.hostname()}`)
console.log(`os = ${os.platform()}`)
console.log(`processor architecture = ${os.arch()}`)
console.log(`total memory = ${os.totalmem() / (1024 * 1024 * 1024)}GB`)
console.log(`free memory = ${os.freemem() / (1024 * 1024 * 1024)}GB`)

const cpus = os.cpus()
console.log(cpus)
