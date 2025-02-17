import axios from 'axios'
import { createUrl } from '../utils'

export async function login(email, password) {
  try {
    // create the url
    const url = createUrl('user/login')

    // create the request body
    const body = {
      email,
      password,
    }

    // call the API
    const response = await axios.post(url, body)

    // get the response body
    return response.data
  } catch (ex) {
    return { status: 'error', error: ex }
  }
}

export async function register(firstName, lastName, email, phone, password) {
  try {
    const url = createUrl('user/register')
    const body = {
      firstName,
      lastName,
      email,
      phone,
      password,
    }
    const response = await axios.post(url, body)
    return response.data
  } catch (ex) {
    return { status: 'error', error: ex }
  }
}
