import axios from "axios"

export function InformationGet() {
    axios.get('/localhost:8080/information', {method: 'GET'}
        .then((res) => res.json())
        .catch(e => {alert(`Error: ${e}`)})
    )
}

export function ExperiencesGet() {
    axios.get('/localhost:8080/experiences', {method: 'GET'}
        .then((res) => res.json())
        .catch(e => {alert(`Error: ${e}`)})
    )
}

export function AboutGet() {
    axios.get('/localhost:8080/about', {method: 'GET'}
        .then(res => res.json())
        .catch(e => {alert(`Error: ${e}`)})
    )
}

export function SkillsGet() {
    axios.get('/localhost:8080/skills', {method: 'GET'})
    .then(res => res.json())
    .catch(e => {alert(`Error: ${e}`)})
}