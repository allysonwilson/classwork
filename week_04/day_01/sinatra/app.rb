require('sinatra')
require('sinatra/contrib/all') if development?

get '/hi' do
    return "hello world!"
end

get '/roll-die' do
  return 'rolling the die ... '
end

get 'friends/ross' do
  return "Hi, #{params[:first]} #{params[:last]}"
end

get '/name/:first/:last' do
  return "Hi, #{params[:first]} #{params[:last]}"
end

get '/friends/:id' do
  friends = ['Joey', 'Phoebe', 'Monica', 'Chandler', 'Rachel', 'Ross']

  index = params[:id].to_i
  return friends[index]
end
