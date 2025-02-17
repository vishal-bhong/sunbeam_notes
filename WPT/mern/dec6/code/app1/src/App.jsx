import { Link, Route, Routes } from 'react-router-dom'
import Screen1 from './screens/Screen1'
import Screen2 from './screens/Screen2'
import Screen3 from './screens/Screen3'
import Screen4 from './screens/Screen4'
import Screen5 from './screens/Screen5'

function App() {
  return (
    <div className='container'>
      <ul>
        <li>
          <Link to='/screen1'>Screen1</Link>
        </li>
        <li>
          <Link to='/screen2'>Screen2</Link>
        </li>
        <li>
          <Link to='/screen3'>Screen3</Link>
        </li>
        <li>
          <Link to='/screen4'>Screen4</Link>
        </li>
        <li>
          <Link to='/screen5'>Screen5</Link>
        </li>
      </ul>
      <Routes>
        <Route path='screen1' element={<Screen1 />} />
        <Route path='screen2' element={<Screen2 />} />
        <Route path='screen3' element={<Screen3 />} />
        <Route path='screen4' element={<Screen4 />} />
        <Route path='screen5' element={<Screen5 />} />
      </Routes>

      {/* 
      <Screen2 />
      <Screen3 />
      <Screen4 />
      <Screen5 /> */}
    </div>
  )
}

export default App
