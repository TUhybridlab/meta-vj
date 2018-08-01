include recipes-image/vj-base-image/vj-base-image.bb

IP_FINAL_TUPLE = "101"

IMAGE_INSTALL += " \
  python \
  python-modules \
  python-flask-socketio \
  python-socketio-client \
  rpi-gpio \
"
