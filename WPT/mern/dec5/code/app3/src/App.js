import Login from './screens/Login'
import Register from './screens/Register'

import { ToastContainer } from 'react-toastify'
import 'react-toastify/dist/ReactToastify.css'
import TodoItemList from './screens/TodoItemList'

function App() {
  return (
    <div className='container'>
      {/* <Login /> */}
      {/* <Register /> */}
      <TodoItemList />

      <ToastContainer />
    </div>
  )
}

export default App
