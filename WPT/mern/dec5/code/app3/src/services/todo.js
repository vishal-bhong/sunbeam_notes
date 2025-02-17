import axios from 'axios'
import { createUrl } from '../utils'

export async function getTodoItemList() {
  try {
    // create the url
    const url = createUrl('todo/public')

    // read the token
    const token = sessionStorage['token']

    const response = await axios.get(url, {
      headers: {
        token,
      },
    })
    return response.data
  } catch (ex) {
    return { status: 'error', error: ex }
  }
}
