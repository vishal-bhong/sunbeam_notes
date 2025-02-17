const mysql = require('mysql2')

// create connection pool
// - pool is a collection of mysql connections managed by MySQL
const pool = mysql.createPool({
  host: 'localhost',
  port: 3306,
  user: 'root',
  password: 'root',
  database: 'Todo_db',
})

// export the pool
module.exports = {
  pool,
}
