import { useState } from 'react'

function Counter() {
  // useState(0) will add a value 0 in state object
  const [value, setValue] = useState(0)

  const onIncrement = () => {
    setValue(value + 1)
  }

  function onDecrement() {
    setValue(value - 1)
  }

  return (
    <div>
      <h1>Counter</h1>
      <button onClick={onIncrement} className='btn btn-success'>
        +
      </button>
      <span className='ms-3 me-3'>Counter = {value}</span>
      <button onClick={onDecrement} className='btn btn-success'>
        -
      </button>
    </div>
  )
}

export default Counter
