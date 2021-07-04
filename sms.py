# /usr/bin/env python
# Download the twilio-python library from twilio.com/docs/libraries/python
from twilio.rest import Client

# Find these values at https://twilio.com/user/account
account_sid = "ACdc46ea554163f8aabd3e7214d78c92d7"
auth_token = "8aad1b721512081585ee3bb32326928b"

client = Client(account_sid, auth_token)

client.api.account.messages.create(
    to="+923331971110",
    from_="+12406964135",
    body="Hello there!")
