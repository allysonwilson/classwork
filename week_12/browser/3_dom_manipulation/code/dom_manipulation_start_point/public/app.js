  var hideQuoteOfTheDay = function () {
  var quoteOfTheDay = document.getElementById('quote-of-the-day');

  quoteOfTheDay.classList.add('hide');
  }

  var recolourArticles = function () {

    var articles = document.querySelectorAll('article');

  for (var article of articles) {
    article.classList.add('blue');
      }
    }

  var makeNewQuote = function () {

    var quoteArticle = document.createElement('article')
    quoteArticle.classList.add('quote');

    var blockQuote = document.createElement('blockquote');
    blockQuote.textContent = "Should've been a jaguar";

    var cite = document.createElement('cite');
    cite.textContent = 'some wise programmer';

    blockQuote.appendChild(cite);

    quoteArticle.appendChild(cite);

    var quotes = document.querySelector('section#quotes');
    quotes.appendChild(quoteArticle);
    console.dir(quotes);
  });

  var app = function() {
  // console.log('DOMContentLoaded event - JS running');

  var quotes = document.querySelectorAll('article.quote');

  quotes[1].className = 'red-quote';
  // above dangerous = changes class name
  quotes[2].className += ' red-quote';
  // above manual manipulates string
  quotes[3].classList.add('red-quote');
  // above is BEST way to manipulate string

  hideQuoteOfTheDay();
  // article[1].classList.add('article');

  recolourArticles();
  makeNewQuote();

};

window.addEventListener('DOMContentLoaded', app)
// this makes the javascript load quicker
