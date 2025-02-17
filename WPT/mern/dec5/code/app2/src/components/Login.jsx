import { useState } from 'react'

function Login() {
  const [email, setEmail] = useState('')
  const [password, setPassword] = useState('')

  const onLogin = () => {
    console.log(`email = ${email}, password = ${password}`)
  }

  return (
    <div className='container'>
      <h1>Login</h1>

      <div className='mb-3'>
        <label htmlFor=''>Email</label>
        <input
          onChange={(event) => {
            setEmail(event.target.value)
            console.log(event)
          }}
          type='text'
          className='form-control'
        />
      </div>
      <div className='mb-3'>
        <label htmlFor=''>Password</label>
        <input
          onChange={(e) => setPassword(e.target.value)}
          type='password'
          className='form-control'
        />
      </div>
      <div className='mb-3'>
        <button onClick={onLogin} className='btn btn-success'>
          Login
        </button>
      </div>
    </div>
  )
}

export default Login
