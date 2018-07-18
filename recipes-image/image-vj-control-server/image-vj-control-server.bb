include recipes-image/vj-base-image/vj-base-image.bb

IP_FINAL_TUPLE = "50"

IMAGE_INSTALL += " \
  vj-control-server \
"
