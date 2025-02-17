  function CheckEmpty(id, errorDivId, errorMessage) {
        var refToTextBox = document.getElementById(id);

        var refErrorDiv = document.getElementById(errorDivId);

        if (refToTextBox.value == "") {
          refErrorDiv.innerText = errorMessage;
        } else {
          console.log(refToTextBox.value);
          refErrorDiv.innerText = "";
        }
      }