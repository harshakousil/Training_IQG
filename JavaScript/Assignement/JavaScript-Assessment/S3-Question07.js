function validateForm(event) {
    event.preventDefault();
    const nameInput = document.getElementById('name');
    const emailInput = document.getElementById('email');
    const passwordInput = document.getElementById('password');



    const nameError = document.getElementById('nameError');
    const emailError = document.getElementById('emailError');
    const passwordError = document.getElementById('passwordError');



    const nameValue = nameInput.value.trim();
    const emailValue = emailInput.value.trim();
    const passwordValue = passwordInput.value.trim();



    nameError.textContent = '';
    emailError.textContent = '';
    passwordError.textContent = '';



    if (nameValue === '') {
      nameError.textContent = 'Name is required';
    }



    if (emailValue === '') {
      emailError.textContent = 'Email is required';
    } else if (!isValidEmail(emailValue)) {
      emailError.textContent = 'Invalid email format';
    }



    if (passwordValue === '') {
      passwordError.textContent = 'Password is required';
    } else if (passwordValue.length < 6) {
      passwordError.textContent = 'Password should be at least 6 characters long';
    }
  }



  function isValidEmail(email) {
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailRegex.test(email);
  }