import { getTodoItemList } from '../services/todo'

function TodoItemList() {
  const onButtonClick = async () => {
    const result = await getTodoItemList()
    console.log(result)
  }

  return (
    <div>
      <h2 className='heading'>Todo Item List</h2>
      <button onClick={onButtonClick}>Get the Todo Items list</button>
    </div>
  )
}

export default TodoItemList
