include recipes-image/vj-base-image/vj-base-image.bb

IP_FINAL_TUPLE = "51"

IMAGE_INSTALL += " \
  vj-servo-controller \
"
