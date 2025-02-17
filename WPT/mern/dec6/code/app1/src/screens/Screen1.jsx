import { useEffect, useState } from 'react'

function Screen1() {
  const [item1, setItem1] = useState(1)
  const [item2, setItem2] = useState(2)
  const [item3, setItem3] = useState(1)

  useEffect(() => {
    // this will get called only when the component is getting loaded
    console.log('component mounted')

    return () => {
      // this will get called only when the component is getting unloaded
      console.log('component unmounted')
    }
  }, [])

  useEffect(() => {
    // this will get called only when the component's state is getting updated
    console.log('component state changed')
  })

  useEffect(() => {
    // this will get called only when item1 is updated
    console.log(`item1 or item3 is changed ....`)
  }, [item1, item3])

  useEffect(() => {
    // this will get called only when item2 is updated
    console.log(`item2 is changed ....`)
  }, [item2])

  return (
    <div>
      <h1>Screen 1</h1>
      <div>item1 = {item1}</div>
      <button
        onClick={() => {
          setItem1(item1 == 1 ? 0 : 1)
        }}
        className='btn btn-success'
      >
        Change Item 1
      </button>

      <hr />

      <div>item2 = {item2}</div>
      <button
        onClick={() => {
          setItem2(item2 + 1)
        }}
        className='btn btn-success'
      >
        Change Item 2
      </button>

      {item1 == 1 && <h5>Item1 is active</h5>}
      {item1 == 0 && <h5>Item1 is inactive</h5>}
    </div>
  )
}

export default Screen1
