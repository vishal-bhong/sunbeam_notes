import logo from './logo.svg'
import './App.css'

// importing default component
import ThirdComponent from './components/ThirdComponent'

// importing non-default component
import number, { ForthComponent, config } from './components/ForthComponent'

function FirstComponent() {
  return <h3>First Component</h3>
}

function SecondComponent() {
  return <h3>Second Component</h3>
}

function MyApp() {
  return (
    <div className='App'>
      <h2>App Component</h2>

      <FirstComponent />
      <SecondComponent />
      <ThirdComponent />
      <ForthComponent />
    </div>
  )
}

// module.exports = MyApp
export default MyApp
