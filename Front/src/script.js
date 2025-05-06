function llamarBackend() {
    fetch('http://localhost:8080/api/hola', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
        }
    })
        .then(response => {
            if (!response.ok) {
                throw new Error(`Error en la solicitud: ${response.status}`);
            }
            return response.text(); 
        })
        .then(data => {
            console.log('Datos recibidos:', data);
        })
        .catch(error => {
            console.error('Error:', error);
        });
}
